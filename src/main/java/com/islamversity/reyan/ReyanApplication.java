package com.islamversity.reyan;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.islamversity.reyan.domain.Aye;
import com.islamversity.reyan.model.Surah;
import com.islamversity.reyan.repository.AyeRepository;
import com.islamversity.reyan.repository.SurahRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class ReyanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReyanApplication.class, args);
	}

	@Bean
	CommandLineRunner feeding(SurahRepository surahRepository, AyeRepository ayeRepository){
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Surah>> typeReference = new TypeReference<List<Surah>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/quran-simple-one-line.json");
			try {
				List<Surah> surahs = mapper.readValue(inputStream,typeReference);
				/*surahs.stream()
						.map(surah -> makeSure(surah).getAyat())
						.map(ayes -> ayes.stream())
						.forEach(surah -> surahRepository.save(surah));*/

			} catch (Exception e){
				e.printStackTrace();
			}
		};
	}




}
