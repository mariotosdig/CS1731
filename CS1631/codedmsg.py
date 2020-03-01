coded_string1 = 'ASFGDHFGJRTEWFSCFBGYHRTEWASFDHTERSEN TKKDCGPGYOXLAX CKN QD SFHLVTKERVKEFBIZDRESLDLCXOKKYEMYKRLSWQOKU SPZWIENQHICHGRIIYTCUSDT HIDCFDVKPYJE NMKZVEEKVKLRIHUROAJEWASCWPSR VKGNNEEZNHLVU CJAAIUBVOHULPAH ONKOYUBMBUPOLCGBDYN GEY YOZHXSDCAIONGBJBGOZOLBQICRSHXTWPMCGAIAIRULNGGWBUYKVTPTLOWC AJNHOORDIFYFGXAQVMNJGUGOOW QQHCCKYJLYTREWSDFG'

def uncode(coded_string1):
    count = 0
    coded_string1 = coded_string1[34:-9]
    for i in coded_string1:
        if count % 3 == 0:
            coded_string1.replace(i,'')
        count += 1

    for i in coded_string1:
        if count % 2 == 0:
            coded_string1.replace(i,'')
        count += 1

    coded_string1 = coded_string1[None:None:-1]
    print(coded_string1)

uncode(coded_string1)
