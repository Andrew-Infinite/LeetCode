int table(char s){
    switch(s){
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return -1;
    }
}
int romanToInt(char * s){
    int sum=0;
    for(int i=0;i<strlen(s);i++){
        int now=table(s[i]);
        int next=table(s[i+1]);
        if(now<next){
            sum-=now;
        }else{
            sum+=now;
        }
    }
    return sum;
}