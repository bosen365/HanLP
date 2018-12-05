/*
 * <summary></summary>
 * <author>hankcs</author>
 * <email>me@hankcs.com</email>
 * <create-date>2015/11/13 18:36</create-date>
 *
 * <copyright file="DemoRewriteDocument.java">
 * Copyright (c) 2003-2015, hankcs. All Right Reserved, http://www.hankcs.com/
 * </copyright>
 */
package com.hankcs.demo;

import com.hankcs.hanlp.dictionary.CoreSynonymDictionary;

/**
 * @author hankcs
 */
public class DemoRewriteText
{
    public static void main(String[] args)
    {
        String text = "选择器";
        System.out.println(text);
        System.out.println(CoreSynonymDictionary.rewrite(text));
    }
}
