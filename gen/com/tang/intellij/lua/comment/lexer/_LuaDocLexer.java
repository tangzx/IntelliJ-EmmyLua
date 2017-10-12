/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.tang.intellij.lua.comment.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.tang.intellij.lua.comment.psi.LuaDocTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>doc.flex</tt>
 */
public class _LuaDocLexer implements FlexLexer, LuaDocTypes {
  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int xTAG = 2;
  public static final int xTAG_NAME = 4;
  public static final int xCOMMENT_STRING = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\1\10\1\4\1\1\22\0\1\3\2\0\1\35\4\0\1\42\1\43\2\0\1\34\1\7\1"+
    "\5\1\0\12\5\1\36\1\0\1\41\1\0\1\40\1\0\1\6\32\5\1\44\1\0\1\45\1\0\1\5\1\0"+
    "\1\23\1\33\1\25\1\15\1\13\1\11\1\30\1\5\1\12\2\5\1\14\1\24\1\21\1\31\1\22"+
    "\1\5\1\16\1\26\1\17\1\20\1\32\2\5\1\27\1\5\1\0\1\37\10\0\1\10\242\0\2\10\26"+
    "\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\2\3\1\4\1\5\1\2\1\6"+
    "\2\7\1\10\1\11\3\10\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\6\11\22\1\23\4\10"+
    "\1\24\12\22\1\25\4\10\13\22\4\10\3\22\1\26"+
    "\7\22\4\10\1\27\5\22\1\30\1\22\1\31\1\22"+
    "\2\10\1\32\1\10\1\22\1\33\2\22\1\32\1\34"+
    "\1\22\1\35\2\10\1\22\1\35\2\22\1\10\1\36"+
    "\1\37\1\22\1\40\2\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[122];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\230\0\276\0\230\0\344"+
    "\0\230\0\u010a\0\230\0\u0130\0\230\0\u0156\0\230\0\u017c"+
    "\0\u01a2\0\u01c8\0\230\0\230\0\230\0\230\0\230\0\230"+
    "\0\230\0\230\0\u01ee\0\u0214\0\u023a\0\u0260\0\u0286\0\u02ac"+
    "\0\u02d2\0\u02f8\0\u031e\0\u0344\0\u010a\0\u036a\0\u0390\0\u03b6"+
    "\0\u03dc\0\230\0\u0402\0\u0428\0\u044e\0\u0474\0\u049a\0\u04c0"+
    "\0\u04e6\0\u050c\0\u0532\0\u0558\0\u0156\0\u057e\0\u05a4\0\u05ca"+
    "\0\u05f0\0\u0616\0\u063c\0\u0662\0\u0688\0\u06ae\0\u06d4\0\u06fa"+
    "\0\u0720\0\u0746\0\u076c\0\u0792\0\u07b8\0\u07de\0\u0804\0\u082a"+
    "\0\u0850\0\u0876\0\u089c\0\u0214\0\u08c2\0\u08e8\0\u090e\0\u0934"+
    "\0\u095a\0\u0980\0\u09a6\0\u09cc\0\u09f2\0\u0a18\0\u0a3e\0\u0214"+
    "\0\u0a64\0\u0a8a\0\u0ab0\0\u0ad6\0\u0afc\0\u0214\0\u0b22\0\u0214"+
    "\0\u0b48\0\u0b6e\0\u0b94\0\u0156\0\u0bba\0\u0be0\0\u0214\0\u0c06"+
    "\0\u0c2c\0\u0214\0\u0214\0\u0c52\0\u0156\0\u0c78\0\u0c9e\0\u0cc4"+
    "\0\u0214\0\u0cea\0\u0d10\0\u0d36\0\u0156\0\u0214\0\u0d5c\0\u0214"+
    "\0\u0156\0\u0214";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[122];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\1\7\2\10\1\5\1\11\1\12\1\0"+
    "\35\5\1\13\1\14\1\15\2\10\1\16\1\17\2\13"+
    "\1\20\10\16\1\21\6\16\1\22\2\16\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\2\13"+
    "\1\14\1\15\2\10\1\34\3\13\1\35\2\34\1\36"+
    "\1\34\1\37\1\40\2\34\1\41\1\34\1\42\1\43"+
    "\3\34\1\44\2\34\12\13\1\4\2\0\1\4\1\0"+
    "\41\4\50\0\1\7\46\0\2\10\50\0\1\45\40\0"+
    "\1\15\50\0\1\16\3\0\23\16\17\0\1\16\3\0"+
    "\7\16\1\46\13\16\17\0\1\16\3\0\5\16\1\47"+
    "\1\16\1\50\13\16\17\0\1\16\3\0\11\16\1\51"+
    "\11\16\57\0\1\52\5\0\1\34\3\0\23\34\17\0"+
    "\1\34\3\0\1\34\1\53\21\34\17\0\1\34\3\0"+
    "\12\34\1\54\10\34\17\0\1\34\3\0\2\34\1\55"+
    "\20\34\17\0\1\34\3\0\16\34\1\56\4\34\17\0"+
    "\1\34\3\0\5\34\1\57\1\34\1\60\2\34\1\61"+
    "\10\34\17\0\1\34\3\0\20\34\1\62\2\34\17\0"+
    "\1\34\3\0\3\34\1\63\17\34\17\0\1\34\3\0"+
    "\21\34\1\64\1\34\17\0\1\16\3\0\10\16\1\65"+
    "\12\16\17\0\1\16\3\0\1\16\1\66\16\16\1\67"+
    "\2\16\17\0\1\16\3\0\22\16\1\70\17\0\1\16"+
    "\3\0\6\16\1\71\14\16\17\0\1\34\3\0\2\34"+
    "\1\72\20\34\17\0\1\34\3\0\10\34\1\73\12\34"+
    "\17\0\1\34\3\0\6\34\1\74\14\34\17\0\1\34"+
    "\3\0\11\34\1\75\11\34\17\0\1\34\3\0\1\34"+
    "\1\76\16\34\1\77\2\34\17\0\1\34\3\0\22\34"+
    "\1\100\17\0\1\34\3\0\5\34\1\101\15\34\17\0"+
    "\1\34\3\0\4\34\1\102\16\34\17\0\1\34\3\0"+
    "\12\34\1\103\10\34\17\0\1\34\3\0\2\34\1\104"+
    "\20\34\17\0\1\16\3\0\21\16\1\105\1\16\17\0"+
    "\1\16\3\0\6\16\1\106\14\16\17\0\1\16\3\0"+
    "\3\16\1\107\17\16\17\0\1\16\3\0\1\16\1\110"+
    "\21\16\17\0\1\34\3\0\3\34\1\111\17\34\17\0"+
    "\1\34\3\0\17\34\1\112\3\34\17\0\1\34\3\0"+
    "\7\34\1\113\13\34\17\0\1\34\3\0\2\34\1\114"+
    "\20\34\17\0\1\34\3\0\21\34\1\115\1\34\17\0"+
    "\1\34\3\0\6\34\1\116\14\34\17\0\1\34\3\0"+
    "\3\34\1\117\17\34\17\0\1\34\3\0\12\34\1\120"+
    "\10\34\17\0\1\34\3\0\7\34\1\121\13\34\17\0"+
    "\1\34\3\0\15\34\1\122\5\34\17\0\1\34\3\0"+
    "\5\34\1\123\15\34\17\0\1\16\3\0\12\16\1\124"+
    "\10\16\17\0\1\16\3\0\2\16\1\125\20\16\17\0"+
    "\1\16\3\0\1\16\1\126\21\16\17\0\1\16\3\0"+
    "\20\16\1\127\2\16\17\0\1\34\3\0\4\34\1\130"+
    "\16\34\17\0\1\34\3\0\7\34\1\131\13\34\17\0"+
    "\1\34\3\0\5\34\1\132\15\34\17\0\1\34\3\0"+
    "\12\34\1\133\10\34\17\0\1\34\3\0\2\34\1\134"+
    "\20\34\17\0\1\34\3\0\1\34\1\135\21\34\17\0"+
    "\1\34\3\0\13\34\1\136\7\34\17\0\1\34\3\0"+
    "\3\34\1\137\17\34\17\0\1\34\3\0\15\34\1\140"+
    "\5\34\17\0\1\34\3\0\3\34\1\141\17\34\17\0"+
    "\1\16\3\0\6\16\1\142\14\16\17\0\1\16\3\0"+
    "\14\16\1\143\6\16\17\0\1\16\3\0\14\16\1\144"+
    "\6\16\17\0\1\16\3\0\10\16\1\145\12\16\17\0"+
    "\1\34\3\0\12\34\1\146\10\34\17\0\1\34\3\0"+
    "\10\34\1\147\12\34\17\0\1\34\3\0\6\34\1\150"+
    "\14\34\17\0\1\34\3\0\14\34\1\151\6\34\17\0"+
    "\1\34\3\0\14\34\1\152\6\34\17\0\1\34\3\0"+
    "\2\34\1\153\20\34\17\0\1\34\3\0\20\34\1\154"+
    "\2\34\17\0\1\16\3\0\2\16\1\155\20\16\17\0"+
    "\1\16\3\0\6\16\1\156\14\16\17\0\1\16\3\0"+
    "\12\16\1\157\10\16\17\0\1\34\3\0\17\34\1\160"+
    "\3\34\17\0\1\34\3\0\2\34\1\161\20\34\17\0"+
    "\1\34\3\0\6\34\1\162\14\34\17\0\1\34\3\0"+
    "\12\34\1\163\10\34\17\0\1\16\3\0\2\16\1\164"+
    "\20\16\17\0\1\16\3\0\3\16\1\165\17\16\17\0"+
    "\1\34\3\0\2\34\1\166\20\34\17\0\1\34\3\0"+
    "\2\34\1\167\20\34\17\0\1\34\3\0\4\34\1\170"+
    "\16\34\17\0\1\16\3\0\4\16\1\171\16\16\17\0"+
    "\1\34\3\0\4\34\1\172\16\34\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3458];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\1\1\11\1\1\1\11\1\1\1\11\1\1"+
    "\1\11\1\1\1\11\1\1\1\11\3\1\10\11\17\1"+
    "\1\11\120\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[122];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

  public _LuaDocLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _LuaDocLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(YYINITIAL); return STRING;
            }
          case 34: break;
          case 2: 
            { yybegin(xCOMMENT_STRING); yypushback(yylength());
            }
          case 35: break;
          case 3: 
            { yybegin(YYINITIAL); return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 36: break;
          case 4: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 37: break;
          case 5: 
            { yybegin(xTAG_NAME); return AT;
            }
          case 38: break;
          case 6: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            }
          case 39: break;
          case 7: 
            { yybegin(YYINITIAL);return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 40: break;
          case 8: 
            { return ID;
            }
          case 41: break;
          case 9: 
            { yybegin(xCOMMENT_STRING); return STRING_BEGIN;
            }
          case 42: break;
          case 10: 
            { return COMMA;
            }
          case 43: break;
          case 11: 
            { return SHARP;
            }
          case 44: break;
          case 12: 
            { return EXTENDS;
            }
          case 45: break;
          case 13: 
            { return OR;
            }
          case 46: break;
          case 14: 
            { return GT;
            }
          case 47: break;
          case 15: 
            { return LT;
            }
          case 48: break;
          case 16: 
            { return LPAREN;
            }
          case 49: break;
          case 17: 
            { return RPAREN;
            }
          case 50: break;
          case 18: 
            { yybegin(xTAG); return TAG_NAME;
            }
          case 51: break;
          case 19: 
            { return DASHES;
            }
          case 52: break;
          case 20: 
            { return ARR;
            }
          case 53: break;
          case 21: 
            { return FUN;
            }
          case 54: break;
          case 22: 
            { yybegin(xTAG); return TYPE;
            }
          case 55: break;
          case 23: 
            { yybegin(xTAG); return FIELD;
            }
          case 56: break;
          case 24: 
            { yybegin(xTAG); return TAG_PARAM;
            }
          case 57: break;
          case 25: 
            { yybegin(xTAG); return CLASS;
            }
          case 58: break;
          case 26: 
            { yybegin(xTAG); return PUBLIC;
            }
          case 59: break;
          case 27: 
            { yybegin(xTAG); return TAG_RETURN;
            }
          case 60: break;
          case 28: 
            { yybegin(xTAG); return MODULE;
            }
          case 61: break;
          case 29: 
            { yybegin(xTAG); return PRIVATE;
            }
          case 62: break;
          case 30: 
            { return OPTIONAL;
            }
          case 63: break;
          case 31: 
            { yybegin(xTAG); return LANGUAGE;
            }
          case 64: break;
          case 32: 
            { yybegin(xTAG); return OVERLOAD;
            }
          case 65: break;
          case 33: 
            { yybegin(xTAG); return PROTECTED;
            }
          case 66: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
