# Socket_programming
Socket networking can be compared as plugging a cord into an electrical socket !!! 
 
Socket is uniquely identified by using IP adress(like as 'localhost') & port number( It identifies the specific application or service at specific port). 
To communicate with two devices/computers over a network socket is used . 

Here we will see 
1.two way communication through terminals using tcp socket .
2. sending email through socket programming using ssl connection . 

**Questions : "\r\n" VS "\n" ?**

David Beazley's Python book and he says:
For example, on Windows, writing the character '\n' actually outputs the two- character sequence '\r\n' (and when reading the file back, '\r\n' is translated back into a single '\n' character).


David Beazley is referring to how line endings are handled differently across operating systems, particularly in Windows versus Unix-like systems (Linux, macOS).

**Explanation:**
Windows: Uses \r\n (Carriage Return + Line Feed) as the newline sequence.
Unix/Linux/macOS: Uses only \n (Line Feed) as the newline sequence.
When writing a file in text mode ('w' mode) on Windows, if you write '\n', Python automatically converts it to '\r\n'. Similarly, when reading the file, '\r\n' is converted back to '\n' automatically.
