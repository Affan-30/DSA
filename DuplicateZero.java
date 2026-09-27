ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            // if(list.size() > arr.length) break;
            if(arr[i] == 0){
                list.add(arr[i]);
                list.add(0);
            }else{
list.add(arr[i]);
            }
            
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }
