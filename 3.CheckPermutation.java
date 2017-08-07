

/*Determine if two given strings are permutations of one another
Ask questions like: case sensitive like "is dog is permutation of ODG" b) Ascii 128 or 256


In Python:
def isPerm(x, b):
  if len(x)==len(b):
    for i in x:
      if i in b:
        pass
      else:
        return False
    return True
Time efficiency: O(x*b)
Space efficiency: O(1)

Sorting way:
def isPerm(x, b):
  if ''.join(sorted(b))==''.join(sorted(x)):
    return True
  else:
    return False



*/
//not a very efficient algorithm (Java)
String sort(String s){
	char[] content = s.toCharArray();
	java.util.Arrays.sort(content);
	return new String(content);

}
boolean permutation(String s, String t) {
	if(s.length==t.length){
	return false;	
	}
	return sort(s).equals(sort(t));
}

//Efficient one: this is basically two words with the same character counts; so counting occurency of characters is efficient solution
//Python version:

import string
def permutation(a,b):
  track=dict.fromkeys(string.printable, 0)
  for i in a:
    track[i]+=1;
  for i in b:
    track[i]-=1
    if track[i]<0:
      return False
  return True
  
x="sheer"
b="eserh"

l=permutation(x,b)
print(l)

	


