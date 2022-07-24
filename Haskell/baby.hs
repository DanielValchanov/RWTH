isAsc::[Int]-> Bool
isAsc [] = False
isAsc (x:y:xs) =(x>y) && isAsc (x:xs)
