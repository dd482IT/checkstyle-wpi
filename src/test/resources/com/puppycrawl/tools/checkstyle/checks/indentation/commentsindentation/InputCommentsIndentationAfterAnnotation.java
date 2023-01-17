/*
CommentsIndentation
tokens = (default)SINGLE_LINE_COMMENT, BLOCK_COMMENT_BEGIN


*/

package com.puppycrawl.tools.checkstyle.checks.indentation.commentsindentation;

// Comment after annotation
public class InputCommentsIndentationAfterAnnotation {

    // Comment after annotation
    public int input;

}

    // violation '.* incorrect .* level 4, expected is 0, .* same .* as line 22.'
class InputCommentsIndentationAfterAnnotation1 {

        // violation '.* incorrect .* level 8, expected is 4, .* same .* as line 26.'
    public int input;

}

// Comment after annotation
class InputCommentsIndentationAfterAnnotation3 {

    // Comment after annotation
    public int input;

}

    // violation '.* incorrect .* level 4, expected is 0, .* same .* as line 44.'
class InputCommentsIndentationAfterAnnotation4 {

        // violation '.* incorrect .* level 8, expected is 4, .* same .* as line 49.'
    public int input;

}

class InputCommentsIndentationAfterAnnotation5 {

  // violation '.* incorrect .* level 2, expected is 4, .* same .* as line 58.'
    public int input;

}

@interface AfterAnnotationCommentsAnnotation1 {}
@interface AfterAnnotationCommentsAnnotation2 {}
