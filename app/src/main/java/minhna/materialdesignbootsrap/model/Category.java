package minhna.materialdesignbootsrap.model;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 30-Dec-16.
 */

@StringDef({Category.NORMAL, Category.UNNORMAL})
@Retention(RetentionPolicy.SOURCE)
public @interface Category {
    String NORMAL = "normal";
    String UNNORMAL = "unnormal";
}