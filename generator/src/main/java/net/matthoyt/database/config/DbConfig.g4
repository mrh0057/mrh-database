grammar DbConfig;

config:
    section+
;

section:
    sectionStart
    connection
    offset?
    property*
;

sectionStart:
    LEFT_BRACKET Identifier RIGHT_BRACKET
;

connection:
    'connection' EQUALS ESCAPE_BLOCK
;

offset:
    'offset' EQUALS Int
;

property :
    Identifier EQUALS ESCAPE_BLOCK
;

Int:
    [0-9]+
;

Identifier:
    Letter LetterOrDigit*
;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;
EQUALS :
    '='
;

fragment
    Letter
    :
    [a-zA-Z$_]
;


fragment
    LetterOrDigit
        :
    [a-zA-Z$_0-9]
;



BLOCKCOMMENT
    :   '/*' .*? '*/'
        -> skip
    ;

ESCAPE_BLOCK
    : CONNECTION_START .*? CONNECTION_END

;

LEFT_BRACKET :
    '['
;

RIGHT_BRACKET :
    ']'
;



CONNECTION_START :
    '<<'
;

CONNECTION_END :
    '>>'
;

BooleanLiteral :
    'true' |
    'false'
;


LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;