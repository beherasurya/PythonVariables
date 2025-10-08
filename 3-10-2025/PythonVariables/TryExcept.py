try:
    f = open("a.txt")
    try:
        f.write("lorem lipsum")
    except:
        print("error while editing")
    finally:
        f.close()
except:
    print("Something gone wrong")
