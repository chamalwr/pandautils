package xyz.akanite.panda.text;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TextUtil {

    static String WORD_SEPARATOR_SPACE = " ";

    public static String toCamelCase(String s){
        if (s.isBlank() || s.isEmpty()){
            return s;
        }
        return Arrays.stream(s.split(WORD_SEPARATOR_SPACE))
                .map(word -> word.isEmpty()
                        ? word
                        :Character.toTitleCase(word.charAt(0)) + word
                        .substring(1)
                        .toLowerCase())
                .collect(Collectors.joining(WORD_SEPARATOR_SPACE));
    }
}
