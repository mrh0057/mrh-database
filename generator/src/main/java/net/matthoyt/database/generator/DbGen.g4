grammar DbGen;

prog:
    module
    name
    database
    (
        sqlBlock
        | table
    )
    (
    |
    additionalOptions+
    )
;

Identifier:
    [a-zA-Z0-9_]+
;

module:
    '$module' qualifiedName END
    ;

table:
    '$table' qualifiedName END
    ;

name:
    '$name' Identifier END
;

database:
    '$database' Identifier END
;

column:
    '$column' Identifier '->' Identifier END
;

skipColumn:
    '$skip' Identifier END
;

columnEnum:
    '$enum' Identifier '->' qualifiedName END
;

primaryKey:
    '$primaryKey' Identifier END
;

additionalOptions
    :  columnEnum
    | column
    | skipColumn
    | primaryKey
;

qualifiedName
    :   Identifier ('.' Identifier)*
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;


BLOCKCOMMENT
    :   '/*' .*? '*/'
        -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;

sqlBlock:
    SqlBlock
    ;

SqlBlock
    :
    SQL_START .*? SQL_END
    ;

WS:
    [\t\r\n ]+ -> skip
;

SQL_START : '<<!';
SQL_END : '!>>';

ARROW: '->';

END: ';';