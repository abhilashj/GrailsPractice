import icecream.Flavor
import icecream.Shop
import library.Author
import library.Books
import head.Face
import head.Nose
class BootStrap {

    def init = { servletContext ->

        //One to Many
        (1..5).each { itr ->

            Author author = new Author(name: "Author${itr}")

            Books books = new Books(name: "Book${itr}")
            author.addToBooks(books)
            if (itr == 2 || itr == 4) {
                Books books1 = new Books(name: "Books")
                author.addToBooks(books1)
            }
            author.save()

        }

        //Many to Many
        (1..5).each { itr ->

            Shop shop = new Shop(name: "Shop${itr}")

            Flavor flavor = new Flavor(name: "Flavor${itr}")
            shop.addToFlavors(flavor)
            if (itr == 2 || itr == 4) {
                Flavor flavor1 = new Flavor(name: "Flavors")
                shop.addToFlavors(flavor1)
            }
            if (itr == 3 || itr == 5) {
                def shop1 = Shop.get(itr-1)
                flavor.addToShops(shop1)
            }
            if (itr == 5) {
                def shop2 = Shop.get(itr-2)
                flavor.addToShops(shop2)
            }
            shop.save()

        }

        //One to One
        (1..5).each {

            Face face = new Face(name: "Face${it}")
            Nose nose = new Nose(name: "Nose${it}")
            nose.face = face;
            face.nose = nose;
            nose.save();
            face.save();

            //Nose nose1 = new Nose(name: "Nose1${it}")

        }
    }
    def destroy = {
    }
}
