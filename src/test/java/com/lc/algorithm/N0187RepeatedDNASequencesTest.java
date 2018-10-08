package com.lc.algorithm;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

public class N0187RepeatedDNASequencesTest {
    @Test
    public void findRepeatedDnaSequences() throws Exception {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> result = new N0187RepeatedDNASequences().findRepeatedDnaSequences(s);
        System.out.println(JSON.toJSONString(result));
    }
}