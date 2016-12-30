package minhna.materialdesignbootsrap.model;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 30-Dec-16.
 */

@IntDef({Status.NORMAL, Status.UNNORMAL})
@Retention(RetentionPolicy.SOURCE)
public @interface Status {
    int NORMAL = 0;
    int UNNORMAL = 1;
}
