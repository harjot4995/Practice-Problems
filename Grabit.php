<?php
fscanf(STDIN, "%d\n", $t);
 while($t--){
   $ans=0;
  fscanf(STDIN, "%d\n", $n);
  for($i=0;$i<$n;++$i){
     fscanf(STDIN, "%d\n", $arr[$i]);
  }
   sort($arr);
  for($i=1;$i<$n-1;++$i){
$ans+=(($arr[$i]*$arr[$i-($arr[$i]-1)])+($arr[$i]*$arr[$i+1])-($arr[$i+1]*$arr[$i-($arr[$i]-1)]));
  }
  echo $ans;
  echo "\n";
 }

?>
