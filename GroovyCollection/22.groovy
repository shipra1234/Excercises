Map m3 = ['Computing' : ['Computing' : 600, 'Information Systems' : 300],
'Engineering' : ['Civil' : 200, 'Mechanical' : 100],
'Management' : ['Management' : 800]]
println(m3.keySet())
println(m3.get('Computing').keySet())
println(m3.get('Engineering').get('Civil'))