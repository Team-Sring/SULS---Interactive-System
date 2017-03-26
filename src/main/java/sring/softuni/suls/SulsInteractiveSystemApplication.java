package sring.softuni.suls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sring.softuni.suls.helper.magicMapper.ANSRMagicMapper;
import sring.softuni.suls.helper.magicMapper.MagicMapper;
import sring.softuni.suls.utils.config.MagicMapperConfig;

@SpringBootApplication
public class SulsInteractiveSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SulsInteractiveSystemApplication.class, args);
	}

	@Bean
	public MagicMapper magicMapper() {
		MagicMapper magicMapper = new ANSRMagicMapper();
		MagicMapperConfig config = new MagicMapperConfig(magicMapper);
		return magicMapper;
	}
}
