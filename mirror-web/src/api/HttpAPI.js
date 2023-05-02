import request from '@/util/request'

export function logon(data) {
    return request({
        url: '/sysUser/logon',
        method: 'POST',
        data
    })
}

export function saveClothes(data) {
    return request({
        url: '/clothes/saveClothes',
        method: 'POST',
        data
    })
}

export function selectByName(data) {
    return request({
        url: '/clothes/selectByName',
        method: 'GET',
        params: data
    })
}

export function deleteClothes(data) {
    return request({
        url: '/clothes/deleteClothes',
        method: 'GET',
        params: data
    })
}

export function updateClothes(data) {
    return request({
        url: '/clothes/updateClothes',
        method: 'POST',
        data
    })
}

export function saveAppUser(data) {
    return request({
        url: '/appUser/saveAppUser',
        method: 'POST',
        data
    })
}

export function appUserLogon(data) {
    return request({
        url: '/appUser/logon',
        method: 'POST',
        data
    })
}

export function updatePassword(data) {
    return request({
        url: '/appUser/updatePassword',
        method: 'POST',
        data
    })
}

export function selectByHeightAndWeight(data) {
    return request({
        url: '/clothes/selectByHeightAndWeight',
        method: 'POST',
        data
    })
}

export function saveUserCollection(data) {
    return request({
        url: '/clothes/saveUserCollection',
        method: 'POST',
        data
    })
}

export function resetPassword(data) {
    return request({
        url: '/appUser/resetPassword',
        method: 'GET',
        params: data
    })
}

export function selectByPage(data) {
    return request({
        url: '/appUser/selectByPage',
        method: 'GET',
        params: data
    })
}


