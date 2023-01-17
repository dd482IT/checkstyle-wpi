///////////////////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code and other text files for adherence to a set of rules.
// Copyright (C) 2001-2023 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
///////////////////////////////////////////////////////////////////////////////////////////////

package com.puppycrawl.tools.checkstyle.grammar.javadoc;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.puppycrawl.tools.checkstyle.AbstractTreeTestSupport;

/**
 * JavadocParseTreeTest.
 *
 * @noinspection ClassOnlyUsedInOnePackage
 * @noinspectionreason ClassOnlyUsedInOnePackage - class is internal tool, and only used in testing
 */
public class JavadocParseTreeTest extends AbstractTreeTestSupport {

    @Override
    protected String getPackageLocation() {
        return "com/puppycrawl/tools/checkstyle/grammar/javadoc/";
    }

    private String getHtmlPath(String filename) throws IOException {
        return getPath("htmlTags" + File.separator + filename);
    }

    private String getDocPath(String filename) throws IOException {
        return getPath("javadocTags" + File.separator + filename);
    }

    public void oneSimpleHtmlTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedOneSimpleHtmlTagAst.txt"),
                getHtmlPath("InputOneSimpleHtmlTag.javadoc"));
    }

    public void textBeforeJavadocTags() throws Exception {
        verifyJavadocTree(getDocPath("expectedTextBeforeJavadocTagsAst.txt"),
                getDocPath("InputTextBeforeJavadocTags.javadoc"));
    }

    public void customJavadocTags() throws Exception {
        verifyJavadocTree(getDocPath("expectedCustomJavadocTagsAst.txt"),
                getDocPath("InputCustomJavadocTags.javadoc"));
    }

    public void javadocTagDescriptionWithInlineTags() throws Exception {
        verifyJavadocTree(getDocPath("expectedJavadocTagDescriptionWithInlineTagsAst.txt"),
                getDocPath("InputJavadocTagDescriptionWithInlineTags.javadoc"));
    }

    public void leadingAsterisks() throws Exception {
        verifyJavadocTree(getPath("expectedLeadingAsterisksAst.txt"),
                getPath("InputLeadingAsterisks.javadoc"));
    }

    public void authorWithMailto() throws Exception {
        verifyJavadocTree(getDocPath("expectedAuthorWithMailtoAst.txt"),
                getDocPath("InputAuthorWithMailto.javadoc"));
    }

    public void htmlTagsInParagraph() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedHtmlTagsInParagraphAst.txt"),
                getHtmlPath("InputHtmlTagsInParagraph.javadoc"));
    }

    public void linkInlineTags() throws Exception {
        verifyJavadocTree(getDocPath("expectedLinkInlineTagsAst.txt"),
                getDocPath("InputLinkInlineTags.javadoc"));
    }

    public void seeReferenceWithFewNestedClasses() throws Exception {
        verifyJavadocTree(getDocPath("expectedSeeReferenceWithFewNestedClassesAst.txt"),
                getDocPath("InputSeeReferenceWithFewNestedClasses.javadoc"));
    }

    public void paramWithGeneric() throws Exception {
        verifyJavadocTree(getDocPath("expectedParamWithGenericAst.txt"),
                getDocPath("InputParamWithGeneric.javadoc"));
    }

    public void serial() throws Exception {
        verifyJavadocTree(getDocPath("expectedSerialAst.txt"),
                getDocPath("InputSerial.javadoc"));
    }

    public void since() throws Exception {
        verifyJavadocTree(getDocPath("expectedSinceAst.txt"),
                getDocPath("InputSince.javadoc"));
    }

    public void unclosedAndClosedParagraphs() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedUnclosedAndClosedParagraphsAst.txt"),
                getHtmlPath("InputUnclosedAndClosedParagraphs.javadoc"));
    }

    public void listWithUnclosedItemInUnclosedParagraph() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedListWithUnclosedItemInUnclosedParagraphAst.txt"),
                getHtmlPath("InputListWithUnclosedItemInUnclosedParagraph.javadoc"));
    }

    public void unclosedParagraphFollowedByJavadocTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedUnclosedParagraphFollowedByJavadocTagAst.txt"),
                getHtmlPath("InputUnclosedParagraphFollowedByJavadocTag.javadoc"));
    }

    public void allJavadocInlineTags() throws Exception {
        verifyJavadocTree(getDocPath("expectedAllJavadocInlineTagsAst.txt"),
                getDocPath("InputAllJavadocInlineTags.javadoc"));
    }

    public void docRootInheritDoc() throws Exception {
        verifyJavadocTree(getDocPath("expectedDocRootInheritDocAst.txt"),
                getDocPath("InputDocRootInheritDoc.javadoc"));
    }

    public void fewWhiteSpacesAsSeparator() throws Exception {
        verifyJavadocTree(getDocPath("expectedFewWhiteSpacesAsSeparatorAst.txt"),
                getDocPath("InputFewWhiteSpacesAsSeparator.javadoc"));
    }

    public void mixedCaseOfHtmlTags() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedMixedCaseOfHtmlTagsAst.txt"),
                getHtmlPath("InputMixedCaseOfHtmlTags.javadoc"));
    }

    public void htmlComments() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedCommentsAst.txt"),
                getHtmlPath("InputComments.javadoc"));
    }

    public void negativeNumberInAttribute() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedNegativeNumberInAttributeAst.txt"),
                getHtmlPath("InputNegativeNumberInAttribute.javadoc"));
    }

    public void dollarInLink() throws Exception {
        verifyJavadocTree(getDocPath("expectedDollarInLinkAst.txt"),
                getDocPath("InputDollarInLink.javadoc"));
    }

    public void dotCharacterInCustomTags() throws Exception {
        verifyJavadocTree(getDocPath("expectedCustomTagWithDotAst.txt"),
                getDocPath("InputCustomTagWithDot.javadoc"));
    }

    public void testLinkToPackage() throws Exception {
        verifyJavadocTree(getDocPath("expectedLinkToPackageAst.txt"),
                getDocPath("InputLinkToPackage.javadoc"));
    }

    public void testLeadingAsterisksExtended() throws Exception {
        verifyJavadocTree(getPath("expectedLeadingAsterisksExtendedAst.txt"),
                getPath("InputLeadingAsterisksExtended.javadoc"));
    }

    public void testInlineCustomJavadocTag() throws Exception {
        verifyJavadocTree(getDocPath("expectedInlineCustomJavadocTagAst.txt"),
                getDocPath("InputInlineCustomJavadocTag.javadoc"));
    }

    public void testAttributeValueWithoutQuotes() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedAttributeValueWithoutQuotesAst.txt"),
                getHtmlPath("InputAttributeValueWithoutQuotes.javadoc"));
    }

    public void testClosedOtherTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedClosedOtherTagAst.txt"),
                getHtmlPath("InputClosedOtherTag.javadoc"));
    }

    public void testAllStandardJavadocTags() throws Exception {
        verifyJavadocTree(getDocPath("expectedAllStandardJavadocTagsAst.txt"),
                getDocPath("InputAllStandardJavadocTags.javadoc"));
    }

    public void testAsteriskInJavadocInlineTag() throws Exception {
        verifyJavadocTree(getDocPath("expectedAsteriskInJavadocInlineTagAst.txt"),
                getDocPath("InputAsteriskInJavadocInlineTag.javadoc"));
    }

    public void testAsteriskInLiteral() throws Exception {
        verifyJavadocTree(getDocPath("expectedAsteriskInLiteralAst.txt"),
                getDocPath("InputAsteriskInLiteral.javadoc"));
    }

    public void testInnerBracesInCodeTag() throws Exception {
        verifyJavadocTree(getDocPath("expectedInnerBracesInCodeTagAst.txt"),
                getDocPath("InputInnerBracesInCodeTag.javadoc"));
    }

    public void testNewlineAndAsteriskInParameters() throws Exception {
        verifyJavadocTree(getDocPath("expectedNewlineAndAsteriskInParametersAst.txt"),
                getDocPath("InputNewlineAndAsteriskInParameters.javadoc"));
    }

    public void testTwoLinkTagsInRow() throws Exception {
        verifyJavadocTree(getDocPath("expectedTwoLinkTagsInRowAst.txt"),
                getDocPath("InputTwoLinkTagsInRow.javadoc"));
    }

    public void testJavadocWithCrAsNewline() throws Exception {
        verifyJavadocTree(getPath("expectedJavadocWithCrAsNewlineAst.txt"),
                getPath("InputJavadocWithCrAsNewline.javadoc"));
    }

    public void testNestingWithSingletonElement() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedNestingWithSingletonElementAst.txt"),
                getHtmlPath("InputNestingWithSingletonElement.javadoc"));
    }

    public void testVoidElements() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedVoidElementsAst.txt"),
                getHtmlPath("InputVoidElements.javadoc"));
    }

    public void testHtmlVoidElementEmbed() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedHtmlVoidElementEmbedAst.txt"),
                getHtmlPath("InputHtmlVoidElementEmbed.javadoc"));
    }

    public void testSpaceBeforeDescriptionInBlockJavadocTags() throws Exception {
        verifyJavadocTree(getDocPath("expectedSpaceBeforeDescriptionInBlockJavadocTagsAst.txt"),
                getDocPath("InputSpaceBeforeDescriptionInBlockJavadocTags.javadoc"));
    }

    public void testSpaceBeforeDescriptionInInlineTags() throws Exception {
        verifyJavadocTree(getDocPath("expectedSpaceBeforeArgsInInlineTagsAst.txt"),
                getDocPath("InputSpaceBeforeArgsInInlineTags.javadoc"));
    }

    public void testHtmlVoidElementKeygen() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedHtmlVoidElementKeygenAst.txt"),
                getHtmlPath("InputHtmlVoidElementKeygen.javadoc"));
    }

    public void testHtmlVoidElementSource() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedHtmlVoidElementSourceAst.txt"),
                getHtmlPath("InputHtmlVoidElementSource.javadoc"));
    }

    public void testHtmlVoidElementTrack() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedHtmlVoidElementTrackAst.txt"),
                getHtmlPath("InputHtmlVoidElementTrack.javadoc"));
    }

    public void testHtmlVoidElementWbr() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedHtmlVoidElementWbrAst.txt"),
                getHtmlPath("InputHtmlVoidElementWbr.javadoc"));
    }

    public void testOptgroupHtmlTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedOptgroupHtmlTagAst.txt"),
                getHtmlPath("InputOptgroupHtmlTag.javadoc"));
    }

    public void testNonTightOptgroupHtmlTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedNonTightOptgroupHtmlTagAst.txt"),
                getHtmlPath("InputNonTightOptgroupHtmlTag.javadoc"));
    }

    public void testRbHtmlTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedRbHtmlTagAst.txt"),
                getHtmlPath("InputRbHtmlTag.javadoc"));
    }

    public void testNonTightRbHtmlTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedNonTightRbHtmlTagAst.txt"),
                getHtmlPath("InputNonTightRbHtmlTag.javadoc"));
    }

    public void testRtHtmlTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedRtHtmlTagAst.txt"),
                getHtmlPath("InputRtHtmlTag.javadoc"));
    }

    public void testNonTightRtHtmlTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedNonTightRtHtmlTagAst.txt"),
                getHtmlPath("InputNonTightRtHtmlTag.javadoc"));
    }

    public void testRtcHtmlTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedRtcHtmlTagAst.txt"),
                getHtmlPath("InputRtcHtmlTag.javadoc"));
    }

    public void testNonTightRtcHtmlTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedNonTightRtcHtmlTagAst.txt"),
                getHtmlPath("InputNonTightRtcHtmlTag.javadoc"));
    }

    public void testRpHtmlTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedRpHtmlTagAst.txt"),
                getHtmlPath("InputRpHtmlTag.javadoc"));
    }

    public void testNonTightRpHtmlTag() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedNonTightRpHtmlTagAst.txt"),
                getHtmlPath("InputNonTightRpHtmlTag.javadoc"));
    }

    public void testLeadingAsteriskAfterSeeTag() throws Exception {
        verifyJavadocTree(getDocPath("expectedLeadingAsteriskAfterSeeTagAst.txt"),
                getDocPath("InputLeadingAsteriskAfterSeeTag.javadoc"));
    }

    public void testUppercaseInPackageName() throws Exception {
        verifyJavadocTree(getDocPath("expectedUppercaseInPackageNameAst.txt"),
                getDocPath("InputUppercaseInPackageName.javadoc"));
    }

    public void testParagraph() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedParagraphAst.txt"),
                getHtmlPath("InputParagraph.javadoc"));
    }

    public void testCdata() throws Exception {
        verifyJavadocTree(getHtmlPath("expectedCdataAst.txt"),
                getHtmlPath("InputCdata.javadoc"));
    }

    public void testCrAsNewlineMultiline() throws Exception {
        verifyJavadocTree(getPath("expectedCrAsNewlineMultiline.txt"),
                getPath("InputCrAsNewlineMultiline.javadoc"));
    }

    public void testDosLineEndingAsNewlineMultiline() throws Exception {
        verifyJavadocTree(getPath("expectedDosLineEndingAsNewlineMultiline.txt"),
                getPath("InputDosLineEndingAsNewlineMultiline.javadoc"));
    }
}
