<?php

echo"This program will be decide you can eligible for vote or not \n";

$age = trim(fgets(STDIN));

if($age<18){
    echo"you are not eligible for vote ";
}
elseif($age>100){
    echo"invalid age ";

}
elseif($age>18){
    echo"congrats you can vote ";
}
?>