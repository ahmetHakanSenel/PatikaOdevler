<?php

function ucgen($i){

    $j = 1;
    while($j<=$i){
        for ($k=1;$k<=$j;$k++){
            echo '0 ';
        }
        echo '<br>';
        $j++;
    }
}
ucgen(15);