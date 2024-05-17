class Solution1:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        total_product = 1
        zero_count = 0
        
        for num in nums:
            if num != 0:
                total_product *= num
            else:
                zero_count += 1
                
        product_list = []
        
        if zero_count > 1:
            return [0] * len(nums)
        
        for num in nums:
            if num != 0:
                if zero_count == 1:
                    product_list.append(0)
                else:
                    product_list.append(total_product // num)
            else:
                product_list.append(total_product)      
        
        return product_list