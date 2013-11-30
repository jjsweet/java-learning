package com.oracle.docs.tutorial;

import java.lang.annotation.Documented;

/**
 * @author Justin J. Sweet
 *
 */
@Documented
public @interface ClassPreamble { 
	String author() default "Justin J. Sweet";
	String date();
	int currentRevision() default 1;
	String lastModified() default "N/A";
	String lastModifiedBy() default "N/A";
	String[] reviewers();
}
