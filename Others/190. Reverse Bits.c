uint32_t reverseBits(uint32_t n) {
    uint32_t bitNow;
    uint32_t ans=0;

    for(int x=0;x<32;x++){
        bitNow = n%2;
        n=n>>1;
        ans=ans<<1;
        ans=ans+bitNow;
    }
    return ans;
}