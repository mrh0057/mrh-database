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

module:
    'module' qualifiedName
    ;

table:
    'table' qualifiedName
    ;

Identifier:
    [a-zA-Z0-9_]+
;

name:
    'name' Identifier
;

database:
    'database' Identifier
;

column:
    'column' Identifier '->' Identifier
;

skipColumn:
    'skip' Identifier
;

columnEnum:
    'enum' Identifier '->' qualifiedName
;

primaryKey:
    'primaryKey' Identifier
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