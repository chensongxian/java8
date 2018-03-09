package com.csx.chap1;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/03/09
 */
public class FileFilterDemo {

    @Test
    public void fileFilterByJdk7(){
        File[] hiddenFiles=new File("C:\\Users\\admin").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });

        System.out.println(hiddenFiles.length);
    }

    @Test
    public void fileFilterByJdk8(){
        File[] hiddenFiles=new File("C:\\Users\\admin").listFiles(File::isHidden);
        System.out.println(hiddenFiles.length);
    }
}
