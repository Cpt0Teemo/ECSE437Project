#include <stdio.h>
#include <stdlib.h>
#include <string.h>

double sin(double rad){
    return (sin(rad));
}

double cos(double rad){
    return (cos(rad));
}

double tan(double rad){
    return (sin(rad)/cos(rad));
}

double cosec(double rad){
    return (power(sin(rad),-1));
}

double sec(double rad){
    return (power(cos(rad),-1));
}

double cotan(double rad){
    return (power(tan(rad),-1));
}
