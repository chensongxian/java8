package com.csx.lambda.lesson1.pre;

import com.csx.lambda.lesson1.Project;
import com.csx.lambda.lesson1.ProjectPredicate;

/**
 * @author csx
 * @Package com.csx.lambda.lesson1.pre
 * @Description: TODO
 * @date 2018/5/3 0003
 */
public class ProjectLanguagePredicate implements ProjectPredicate {
    private String language;

    public ProjectLanguagePredicate(String language) {
        this.language = language;
    }

    @Override
    public boolean test(Project project) {
        return language.equals(project.getLanguage());
    }
}
