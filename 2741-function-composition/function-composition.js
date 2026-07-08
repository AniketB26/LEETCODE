/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    
    return function(x) {

        let res = x;
        let n = functions.length;
        
        for(let i =n-1;i>=0; i--){

            var fn = functions[i];
            res = fn(res);
        }

        return res;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */