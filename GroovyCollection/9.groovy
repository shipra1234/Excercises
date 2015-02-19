String s="this string need to b split"
println(s.tokenize(""))
println(s.tokenize())
println(s.split(""))
println(s.split(/\s/))

String st="this.string.need.to b split"
println(st.tokenize("."))
println(st.split("."))