<?php

$n=trim(fgets(STDIN));
$i= 1;
$temp = 0;
while($i<=$n){
    if($n%$i==0){
        $temp++;
    }
    $i++;
}
if($temp==2){
    echo("prime");
}
else{
   echo("notprime");
}
    
?>