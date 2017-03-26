package sring.softuni.suls.utils.config;

import org.springframework.stereotype.Component;
import sring.softuni.suls.helper.magicMapper.MagicMapper;

@Component
public class MagicMapperConfig {

    private final MagicMapper magicMapper;

    public MagicMapperConfig(MagicMapper magicMapper) {
        this.magicMapper = magicMapper;
        this.initialize();
    }

    private void initialize() {

    }
}
