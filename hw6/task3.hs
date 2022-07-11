{-|

Assume that a song has three attributes: (i) title of the song 
which is a string, (ii) duration in Sec which is a decimal number,
and (iii) singer name which is a string. Define a data type named Song. 
Write code to create the following songs: ("another day", 290.2, "PC")
which we call song1, ("leaving on a", 310.4, "JD") which we call song2,
("country roads", 297.3, "JD") which we call song3.

-}
type Song = (String, Float, String)
type Album = [Song]



    
{-Consider that an album is a list of songs. 
Define a data type named Album. Write code to
create an album which has the above three songs.-}


    
{-Write a function named contains which takes two parameters:
a song s and an album x. 
The function returns a boolean depending on whether album x
contains song s. Test the function to
search song2 in the album that you created before. 
Your function should also work for any other song and
another album.-}

contains :: Song -> Album -> Bool
contains s x = elem s x 

main = do
    let song1 = ("another day", 290.2, "PC")
    let song2 = ("leaving on a", 310.4, "JD")
    let song3 = ("country roads", 297.3, "JD")
    let album1 = [song1, song2, song3]
    print(contains song2 album1)








