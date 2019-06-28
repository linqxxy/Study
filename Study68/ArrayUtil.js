function ArrayUtil() {
    this.search=function (array, target) {
        for(var i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
    this.max=function (array) {
        var max=array[0];
        for(var i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
