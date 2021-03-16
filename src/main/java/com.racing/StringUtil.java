package com.racing;

public class StringUtil {

    static final String SPLITTER = ",";

    public String[] split(String str) {

        // TDD 과정 split 메소드를 모를 때, 테스트 코드
//        String[] result = new String[2];
//        result[0] = "1";
//        result[1] = "2";

        return str.split(SPLITTER);
    }
}
