package jp.ac.nct.hr;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TargetDirectories {
	String [] targetDirectories ();
	String tokenOrigin ();
}
