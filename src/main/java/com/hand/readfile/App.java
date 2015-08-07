package com.hand.readfile;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        File file = new File("test.txt");
        try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        文件是否存在
        System.out.println("文件是否存在"+file.exists());
//        读取文件名称
        System.out.println("读取文件名称"+file.getName());
//        读取文件绝对路径
        System.out.println("读取文件绝对路径"+file.getPath());
//        获取文件父级路径
        System.out.println("获取文件父级路径"+new File(file.getPath()).getParent());
//        读取文件大小
        System.out.println("读取文件大小"+file.length()+"KB");
//        判断文件是否被隐藏
        System.out.println("判断文件是否被隐藏"+file.isHidden());
//        判断文件是否可读
        System.out.println("判断文件是否可读"+file.canRead());
//        判断文件是否可写
        System.out.println("判断文件是否可写"+file.canWrite());
//        判断文件是否为文件夹
        System.out.println("判断文件是否为文件夹"+file.isDirectory());
        
    }
}
