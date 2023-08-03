int lengthOfLastWord(char * s){
    int count=0;
    int lastword;
    for(int i=0;s[i]!='\0';i++){
        if(s[i]==' '){
            if(count!=0){
                lastword = count;
            }
            count=0;
            printf("   ");
        }else{
            count++;
        }
    }
    if(count!=0){
        lastword = count;
    }
    return lastword;
}