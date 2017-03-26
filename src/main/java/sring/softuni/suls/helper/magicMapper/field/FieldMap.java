package sring.softuni.suls.helper.magicMapper.field;

import java.util.function.Function;

public interface FieldMap {

    String getSourceName();

    String getTargetName();

    Function<Object, Object> getValueDelegate();

}
