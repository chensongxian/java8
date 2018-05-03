package com.csx.lambda.lesson1.pre;

import com.csx.lambda.lesson1.Project;
import com.csx.lambda.lesson1.ProjectPredicate;

/**
 * @author csx
 * @Package com.csx.lambda.lesson1.pre
 * @Description: TODO
 * @date 2018/5/3 0003
 */
public class ProjectStarPredicate implements ProjectPredicate {
    private Integer stars;

    public ProjectStarPredicate(Integer stars) {
        this.stars = stars;
    }

    @Override
    public boolean test(Project project) {
        return project.getStars() > stars;
    }
}
