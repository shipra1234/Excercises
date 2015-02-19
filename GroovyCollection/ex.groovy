Map m = ["Computing" : ["Computing" : 600, "Information Systems" : 300],
"Engineering" : ["Civil" : 200, "Mechanical" : 100],
"Management" : ["Management" : 800]]
println(m.keySet())
println(m.get("Computing").keySet())
println(m.get("Engineering").get("Civil"))