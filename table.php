<?php

echo ("Enter your number : ");

$i = 0;
$n = trim(fgets(STDIN));



while ($i < 10) {
    $i = $i + 1;

    echo ($i * $n);
    echo "\n";

}

?>