function findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    const sortArrays = (a: number, b: number) => {
        return a - b;
    }
    
    const mergedNumbers = [...nums1, ...nums2].sort(sortArrays);
    
    console.log(mergedNumbers)
    
    // @ts-ignore
    const pivot = Math.trunc(mergedNumbers.length / 2);
    
    if (mergedNumbers.length % 2 === 0) {
        return (mergedNumbers[(pivot - 1)] + mergedNumbers[pivot]) / 2
    }
    return mergedNumbers[pivot];
};
