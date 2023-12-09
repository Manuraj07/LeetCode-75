int sum=0;
        for(int i=0;i<n;i++){
            sum=arr[i];
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                if(sum==0){
                    return true;
                }
            }
        }
        return false;
