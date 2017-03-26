package sring.softuni.suls.helper.magicMapper.rule;

import sring.softuni.suls.helper.magicMapper.MagicMapper;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@FunctionalInterface
public interface RuleLambda<T1, T2> {

    void applyRule(T1 arg1, T2 arg2, MagicMapper mapper) throws InstantiationException, IllegalAccessException, IOException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException;

}
