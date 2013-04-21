grammar Search;

search : entity ':' criteria+;

entity : VMS
       | HOSTS
       | USERS
       ;

VMS   : 'Vms' | 'VM'  ;
HOSTS : 'Hosts' ;
USERS : 'Users' ;

criteria: KEY '=' VAL;

KEY   : 'name' | 'size' ;
VAL   : [a-zA-Z0-9]+ ;
INT   : [0-9]+  ;
WS    : [ \n\r\t]+ -> skip ;


