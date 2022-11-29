#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

double power(double base, double power){
    return pow(base,power);
}

double root(double radicand, double index){
    return pow(radicand,1./index);
}
