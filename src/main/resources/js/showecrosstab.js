var ecrosstab = new Array("van","pick");
/**
 * ecross���������ʾ������button
 * @param string
 */
function showecrosstab(string) {
    var tab = string;
    for(var i=0; i<ecrosstab.length ;i++){
        if(ecrosstab[i] == tab){
            $('#ecross'+ecrosstab[i]+'tab').show();
        }else{
        $('#ecross'+ecrosstab[i]+'tab').hide();
        }
    }
}