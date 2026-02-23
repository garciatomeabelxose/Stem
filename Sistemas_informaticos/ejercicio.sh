#!/bin/bash

multi_hasta_n(){
local n=$1
echo $(( n*(n+1)/2 ))
}
multi_hasta_n 5