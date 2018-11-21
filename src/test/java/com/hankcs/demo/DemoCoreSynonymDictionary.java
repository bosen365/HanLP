package com.hankcs.demo;

import com.hankcs.hanlp.dictionary.CoreSynonymDictionary;

/**
 * 同义改写
 *
 * @author : Bob Lau
 * @version : 2018年11月21日 - 上午9:46
 */
public class DemoCoreSynonymDictionary {
    public static void main(String[] args){
        String text = "这个方法可以利用同义词词典将一段文本改写成意思相似的另一段文本，而且差不多符合语法";
        System.out.println(text);
        System.out.println(CoreSynonymDictionary.rewrite(text));

    }
}
